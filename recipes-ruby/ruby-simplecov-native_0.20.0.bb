SUMMARY = "Code coverage for Ruby with a powerful configuration library"
HOMEPAGE = "https://github.com/colszowka/simplecov"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0372eac36f921e2a3d78dcb0bb6c4f76"

DEPENDS += "\
            ruby-docile-native \
            ruby-simplecov-html-native \
            ruby-simplecov-json-formatter-native \
           "

SRC_URI[md5sum] = "402ee33cadf7cc7d3a42d4cf4f0776fe"
SRC_URI[sha256sum] = "8b8d390017743fcbe83387563b17b8b73da9cb4f3486300b358413d37603a2d6"

GEM_NAME = "simplecov"

inherit rubygems
inherit native
