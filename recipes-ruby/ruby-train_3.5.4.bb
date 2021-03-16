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

SRC_URI[md5sum] = "de81254c3669d3bc34093b859edf8534"
SRC_URI[sha256sum] = "da69f837cfc8bdd041929cd3de5777e7bc81125dfcd3f9d587619361b5a8485c"

GEM_NAME = "train"

inherit rubygems
