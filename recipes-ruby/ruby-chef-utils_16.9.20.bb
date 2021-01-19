SUMMARY = "RubyGem: chef-utils"
DESCRIPTION = "Basic utility functions for Core Chef Infra development"
HOMEPAGE = "https://github.com/chef/chef/tree/master/chef-utils"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f7bb094c7232b058c7e9f2e431f389c"

DEPENDS += ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "a7c8a08e2575b527ed998d3889666a13"
SRC_URI[sha256sum] = "2fb4613a8ecb712b9bb21ecc6c1fd88d7dbc67126e4e491cbb7f13f2c37172c0"

GEM_NAME = "chef-utils"

inherit rubygems
