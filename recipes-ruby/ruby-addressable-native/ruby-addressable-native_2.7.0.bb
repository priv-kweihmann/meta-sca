SUMMARY = "Addressable is an alternative implementation to the URI implementation"
HOMEPAGE = "https://github.com/sporkmonger/addressable"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=f124bfaefacd4e1a4080065d403bc1d4"

DEPENDS += "ruby-public-suffix-native"

SRC_URI[md5sum] = "0428adce40bb7468884ee739b61792fd"
SRC_URI[sha256sum] = "5e9b62fe1239091ea9b2893cd00ffe1bcbdd9371f4e1d35fac595c98c5856cbb"

GEM_NAME = "addressable"

inherit rubygemsnative
