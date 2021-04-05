SUMMARY = "RubyGem: chef-config"
DESCRIPTION = "Chef Infra's default configuration and config loading library"
HOMEPAGE = "https://github.com/chef/chef/tree/master/chef-config"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f7bb094c7232b058c7e9f2e431f389c"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-addressable \
                  ruby-chef-utils \
                  ruby-fuzzyurl \
                  ruby-mixlib-config \
                  ruby-mixlib-shellout \
                  ruby-tomlrb"

SRC_URI[md5sum] = "bdec5b308c4062fd167732ca4b9e7493"
SRC_URI[sha256sum] = "6a869d512e256c32e797f3b7327694593b96c03ad0ff138246a94ce8a3c283a6"

GEM_NAME = "chef-config"

inherit rubygems
