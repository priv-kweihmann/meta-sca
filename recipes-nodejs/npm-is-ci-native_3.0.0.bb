SUMMARY = "NPM: is-ci"
DESCRIPTION = "Detect if the current environment is a CI server"
HOMEPAGE = "https://github.com/watson/is-ci"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=69386bc3e18d6a71ce25b9aa39ecf076"

DEPENDS = "npm-ci-info-native"

SRC_URI = "https://registry.npmjs.org/is-ci/-/is-ci-3.0.0.tgz"
SRC_URI[md5sum] = "36e522df842b89fbccee5d6a2cb07b0a"
SRC_URI[sha256sum] = "10915c98cce9bdbc3e5dc893ff06ae1bb2dc225aa05bdb6414a53d8125771a37"

NPM_PKGNAME = "is-ci"

inherit npmhelper
inherit native
