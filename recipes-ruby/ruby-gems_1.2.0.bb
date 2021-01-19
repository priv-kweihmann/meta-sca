SUMMARY = "RubyGem: gems"
DESCRIPTION = "Ruby wrapper for the RubyGems.org API"
HOMEPAGE = "https://github.com/rubygems/gems"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=842ca4a33be30d4a5d5ea377568b309b"

DEPENDS += ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "6cef91acf7385cacee0adcff8849b0ca"
SRC_URI[sha256sum] = "343d74bd54d906f38193f3ccd983f9d08c4b54cd01ee7e5fe8467ab41a9946f0"

GEM_NAME = "gems"

inherit rubygems
