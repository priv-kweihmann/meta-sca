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

SRC_URI[md5sum] = "324d5f9930fdd598ce272951829cd982"
SRC_URI[sha256sum] = "ec1543c32d981e77b8a9f2643efee949add22c7dc2f556a7df0a1b50be8c68f4"

GEM_NAME = "train-core"

inherit rubygems
