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

SRC_URI[md5sum] = "eeb2b981e2ae37dd108f20a274f0a0bf"
SRC_URI[sha256sum] = "2cb0ec9a66be0a02b2a70f1202726a77b44d9331a04d4b84697ff39d9e5a54cd"

GEM_NAME = "train"

inherit rubygems
