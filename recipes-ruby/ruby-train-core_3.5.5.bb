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

SRC_URI[md5sum] = "38fdd642bbac7d999cce93147434f8fe"
SRC_URI[sha256sum] = "235d7609db0f40856284394693a6824a729c29fb80a8de76ff8eb2de7f7081b8"

GEM_NAME = "train-core"

inherit rubygems
