SUMMARY = "RubyGem: chef-config"
DESCRIPTION = "Chef Infra's default configuration and config loading library"
HOMEPAGE = "https://github.com/chef/chef/tree/master/chef-config"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f7bb094c7232b058c7e9f2e431f389c"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-addressable \
                  ruby-chef-utils \
                  ruby-fuzzyurl \
                  ruby-mixlib-config \
                  ruby-mixlib-shellout \
                  ruby-tomlrb"

SRC_URI[md5sum] = "83c3b33e2cb7fe06dc9d73d27a844241"
SRC_URI[sha256sum] = "707b75c34b5ef71a9e3a13b1f49143a908b1a580529312721ba58577af690592"

GEM_NAME = "chef-config"

inherit rubygems
