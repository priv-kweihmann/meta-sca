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

SRC_URI[md5sum] = "139e219e03b5cb712de875f94310e5c3"
SRC_URI[sha256sum] = "2b388dc2f6eeb06ea7562831d0f693cd0a26e282c1493950412a7743766acfe7"

GEM_NAME = "chef-config"

inherit rubygems
