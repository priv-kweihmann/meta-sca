#!/bin/sh
bitbake \
        acl \
        bad-json \
        bad-nginx \
        bad-perl \
        bad-python-reqs \
        bad-pythoon-types \
        bad-systemd \
        bad-xml \
        bad-yaml \
        busybox \
        core-image-minimal-scatest \
        openssh \
        simple-c \
        $@