SUMMARY = "Code coverage for Ruby with a powerful configuration library"
HOMEPAGE = "https://github.com/colszowka/simplecov"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0372eac36f921e2a3d78dcb0bb6c4f76"

DEPENDS += "\
            ruby-docile-native \
            ruby-simplecov-html-native \
           "

SRC_URI[md5sum] = "e642ceefc9a842d1e52f2f40121739c1"
SRC_URI[sha256sum] = "b9228393465c2b69468d30f949331aa36cd99cbd3f0fc64a39d3603a731708ac"

GEM_NAME = "simplecov"

inherit rubygemsnative
