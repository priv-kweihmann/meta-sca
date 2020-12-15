SUMMARY = "RubyGem: train"
DESCRIPTION = "Transport interface to talk to different backends."
HOMEPAGE = "https://github.com/inspec/train"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f7bb094c7232b058c7e9f2e431f389c"

DEPENDS = ""
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

SRC_URI[md5sum] = "135c36db27a6e71804afd3b381bcddd0"
SRC_URI[sha256sum] = "f40afd3c23db1e9b283acb58490a842fe22f53243bfd467ef3ed38c3dabe59aa"

GEM_NAME = "train"

inherit rubygems
