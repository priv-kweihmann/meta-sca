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

SRC_URI[md5sum] = "26f634e96882c717bfedd3c826e41362"
SRC_URI[sha256sum] = "bd1fdb4f31d8450732fb56e39b3d66e600f640c3a5321bd9c0cfa024b9030001"

GEM_NAME = "chef-config"

inherit rubygems
