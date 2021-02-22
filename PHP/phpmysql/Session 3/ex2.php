<?php
class Cow extends Animal{
    private $owner;

    public function __construct($family, $food)
{
    parent::__construct($family, $food);
}

    /**
     * @return mixed
     */
    public function getOwner()
    {
        return $this->owner;
    }

    /**
     * @param mixed $owner
     */
    public function setOwner($owner): void
    {
        $this->owner = $owner;
    }
}
