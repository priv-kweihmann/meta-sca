SUMMARY = "RubyGem: hashie"
DESCRIPTION = "Hashie is a collection of classes and mixins that make hashes more powerful."
HOMEPAGE = "https://github.com/hashie/hashie"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=dd1ec82dd4ea7ed5eebb24bebec9f068"

DEPENDS = ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "fa7b371f4735cd7cd7e215e969757a5b"
SRC_URI[sha256sum] = "7890dcb9ec18a4b66acec797018c73824b89cef5eb8cda36e8e8501845e87a09"

GEM_NAME = "hashie"

inherit rubygems
