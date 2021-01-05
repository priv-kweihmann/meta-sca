SUMMARY = "RubyGem: simplecov"
DESCRIPTION = "Code coverage for Ruby with a powerful configuration library and automatic merging of coverage across test suites"
HOMEPAGE = "https://github.com/simplecov-ruby/simplecov"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0372eac36f921e2a3d78dcb0bb6c4f76"

DEPENDS += "ruby-docile-native \
                  ruby-simplecov-html-native \
                  ruby-simplecov-json-formatter-native"
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "ba04bd63d46e9464782f3d5859dd60f3"
SRC_URI[sha256sum] = "c2a6ec3f6b0c566672fbdf31fe9d6e96af0e84802362114bf69665164c46666f"

GEM_NAME = "simplecov"

inherit rubygems
inherit native
