#!/bin/sh
bitbake \
        packagegroup-sca-test \
        bad-go \
        bad-html \
        bad-perl \
        busybox \
        cspell \
        linux-yocto \
        openssh \
        simple-c \
        $@