SUMMARY = "NPM: semver-compare"
DESCRIPTION = "compare two semver version strings, returning -1, 0, or 1"
HOMEPAGE = "https://github.com/substack/semver-compare"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/semver-compare/-/semver-compare-1.0.0.tgz"
SRC_URI[md5sum] = "ce0d32aa0c9e8c41f2c5540891f4b4fa"
SRC_URI[sha256sum] = "e7f1699719a7da81a90fe09752e3d3101ed40b8b9b7416073c74417e8dcf3c80"

NPM_PKGNAME = "semver-compare"

inherit npmhelper
inherit native
