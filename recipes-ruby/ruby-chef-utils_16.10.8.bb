SUMMARY = "RubyGem: chef-utils"
DESCRIPTION = "Basic utility functions for Core Chef Infra development"
HOMEPAGE = "https://github.com/chef/chef/tree/master/chef-utils"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f7bb094c7232b058c7e9f2e431f389c"

DEPENDS += ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "12d46bf22e9cd20c13e92c91f968b642"
SRC_URI[sha256sum] = "fba31fa7ec8df7f2d4ab3852675ddf646438cbfece26d2f5eb7d8b72cbc23081"

GEM_NAME = "chef-utils"

inherit rubygems
