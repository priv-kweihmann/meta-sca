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

SRC_URI[md5sum] = "a52dc9306e027a87c415851858710487"
SRC_URI[sha256sum] = "89bc2aaaa3993687bb91665cf0bda5d3524a42721e22a441972f96d3d350e8ec"

GEM_NAME = "train"

inherit rubygems
