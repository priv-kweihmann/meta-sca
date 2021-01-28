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

SRC_URI[md5sum] = "1534cb6e9cff3f3615d68e130c101b5f"
SRC_URI[sha256sum] = "2cd0ed9d55901eb8dd0b66a3dfece03a91920b11fef4b6d1265a68b78cfed76b"

GEM_NAME = "chef-config"

inherit rubygems
