SUMMARY = "Module that adds descendant tracking to a class"
HOMEPAGE = "https://github.com/dkubb/descendants_tracker"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a424947e9eb86ed8d34d6b437a077b9b"

DEPENDS += "ruby-thread-safe-native"

SRC_URI[md5sum] = "8653c98e777eddaddf369109af107b0f"
SRC_URI[sha256sum] = "e9c41dd4cfbb85829a9301ea7e7c48c2a03b26f09319db230e6479ccdc780897"

GEM_NAME = "descendants_tracker"

inherit rubygemsnative
