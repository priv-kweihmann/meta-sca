SUMMARY = "RubyGem: ruby2_keywords"
DESCRIPTION = "Shim library for Module#ruby2_keywords"
HOMEPAGE = "https://github.com/ruby/ruby2_keywords"

LICENSE = "Ruby & BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4cf5ceb8f271a96fe2e4ab32bc1e828d"

DEPENDS += ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "5e7c39f4ff29e86a992d6c98bc9160d3"
SRC_URI[sha256sum] = "3ae3189c2e1d2f60204dcceedf890ff49dd28979771e2576016a3ee73b668e97"

GEM_NAME = "ruby2_keywords"

inherit rubygems
