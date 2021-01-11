SUMMARY = "RubyGem: simplecov"
DESCRIPTION = "Code coverage for Ruby with a powerful configuration library and automatic merging of coverage across test suites"
HOMEPAGE = "https://github.com/simplecov-ruby/simplecov"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0372eac36f921e2a3d78dcb0bb6c4f76"

DEPENDS += "ruby-docile-native \
                  ruby-simplecov-html-native \
                  ruby-simplecov-json-formatter-native"
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "575c6c7861cb467292671ee37e5b795c"
SRC_URI[sha256sum] = "990db6aedb55086d6bf8874993ff1f796e4830abfa11937468ca502a0d013bc3"

GEM_NAME = "simplecov"

inherit rubygems
inherit native
