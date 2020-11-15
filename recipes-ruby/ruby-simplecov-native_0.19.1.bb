SUMMARY = "Code coverage for Ruby with a powerful configuration library"
HOMEPAGE = "https://github.com/colszowka/simplecov"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0372eac36f921e2a3d78dcb0bb6c4f76"

DEPENDS += "\
            ruby-docile-native \
            ruby-simplecov-html-native \
           "

SRC_URI[md5sum] = "29a4d3403dbd51835d5e29a0492e3e6d"
SRC_URI[sha256sum] = "98c1f875df4bcaeb0de64a753e96eced7e6139f3051a45804e75ed1f2b58bc03"

GEM_NAME = "simplecov"

inherit rubygemsnative
