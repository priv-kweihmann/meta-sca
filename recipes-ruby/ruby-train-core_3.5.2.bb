SUMMARY = "RubyGem: train-core"
DESCRIPTION = "A minimal Train with a backends for ssh and winrm."
HOMEPAGE = "https://github.com/inspec/train"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f7bb094c7232b058c7e9f2e431f389c"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-addressable \
                  ruby-ffi \
                  ruby-json \
                  ruby-mixlib-shellout \
                  ruby-net-scp \
                  ruby-net-ssh"

SRC_URI[md5sum] = "109afe08768c2a1f295d97885ee662be"
SRC_URI[sha256sum] = "128098262e4159be8d7c12818fd2cf2e998362eca30bc54e27a04e046ebcc268"

GEM_NAME = "train-core"

inherit rubygems
