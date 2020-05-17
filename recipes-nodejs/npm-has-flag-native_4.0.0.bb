SUMMARY = "NPM: has-flag"
DESCRIPTION = "Check if argv has a specific flag"
HOMEPAGE = "https://github.com/sindresorhus/has-flag#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

SRC_URI = "https://registry.npmjs.org/has-flag/-/has-flag-4.0.0.tgz"
SRC_URI[md5sum] = "d48b4e68ca6cd00a3f95a43f88625684"
SRC_URI[sha256sum] = "77a7eb1411d927bb8a5ca7069dbe168886d63c88f446f0b81500a2cf23ddb5b1"

NPM_PKGNAME = "has-flag"

inherit npmhelper
inherit native
