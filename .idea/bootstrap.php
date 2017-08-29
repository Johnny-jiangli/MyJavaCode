<?php
session_start();
// bootstrap.php
use Doctrine\ORM\Tools\Setup;
use Doctrine\ORM\EntityManager;

require_once "vendor/autoload.php";

class App
{
    private $isDevMode = true;
// database configuration parameters
    private $conn = array(
        'dbname' => 'ziyan',
        'user' => 'jiangwei_test',
        'password' => 'jiangwei_test',
        'host' => 'localhost:3307',
        'driver' => 'pdo_mysql',
    );
    public $entityManager;

    /**
     * App constructor.
     */
    public function __construct()
    {
        $config = Setup::createAnnotationMetadataConfiguration(array(__DIR__ . "/model"), $this->isDevMode,__DIR__ . "/proxy");
        $this->entityManager = EntityManager::create($this->conn, $config);
    }

}
