SUMMARY = "RubyGem: simplecov"
DESCRIPTION = "Code coverage for Ruby with a powerful configuration library and automatic merging of coverage across test suites"
HOMEPAGE = "https://github.com/simplecov-ruby/simplecov"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0372eac36f921e2a3d78dcb0bb6c4f76"

DEPENDS += "ruby-docile-native \
                  ruby-simplecov-html-native \
                  ruby-simplecov-json-formatter-native"
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "2eeebff72b8ecbaa45b1d40ce72faa28"
SRC_URI[sha256sum] = "6c94e8a32d4f3c92dcc5ef15511ec14b40b2e13ae6da52a96bcf3a50515a1955"

GEM_NAME = "simplecov"

inherit rubygems
inherit native
