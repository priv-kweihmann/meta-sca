#!/bin/sh
bitbake \
        busybox \
        core-image-minimal-scatest \
        $@