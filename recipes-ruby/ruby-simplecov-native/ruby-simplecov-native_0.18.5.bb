SUMMARY = "Code coverage for Ruby with a powerful configuration library"
HOMEPAGE = "https://github.com/colszowka/simplecov"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0372eac36f921e2a3d78dcb0bb6c4f76"

DEPENDS += "\
            ruby-docile-native \
            ruby-simplecov-html-native \
           "

SRC_URI[md5sum] = "e21ae8ae702824cd646b7bdef810b72d"
SRC_URI[sha256sum] = "d9386622c4e26aa94f159b407756a69d6f615a9e4b6a242e948bf9940c2e9d79"

GEM_NAME = "simplecov"

inherit rubygemsnative
