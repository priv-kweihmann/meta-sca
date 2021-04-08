SUMMARY = "RubyGem: train"
DESCRIPTION = "Transport interface to talk to different backends."
HOMEPAGE = "https://github.com/inspec/train"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f7bb094c7232b058c7e9f2e431f389c"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-activesupport \
                  ruby-azure-graph-rbac \
                  ruby-azure-mgmt-key-vault \
                  ruby-azure-mgmt-resources \
                  ruby-azure-mgmt-security \
                  ruby-azure-mgmt-storage \
                  ruby-docker-api \
                  ruby-google-api-client \
                  ruby-googleauth \
                  ruby-inifile \
                  ruby-train-core \
                  ruby-train-winrm"

SRC_URI[md5sum] = "050811a1421bd28f054255d064201325"
SRC_URI[sha256sum] = "edd28c85ee871e49de5411fcf6f05e4b3660338a769586f6d2dc368ae32b8729"

GEM_NAME = "train"

inherit rubygems
