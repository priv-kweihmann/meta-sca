#!/bin/sh
bitbake acl -c clean
bitbake core-image-minimal -c clean
bitbake acl
bitbake core-image-minimal