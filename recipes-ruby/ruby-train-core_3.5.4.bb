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

SRC_URI[md5sum] = "9191fda5d10b28d1a5c2d9a02dcd5b98"
SRC_URI[sha256sum] = "5d4ae7f882f4ffc5ca654024850c63deac8b4058efa5ad22ffaa440ea8e16590"

GEM_NAME = "train-core"

inherit rubygems
