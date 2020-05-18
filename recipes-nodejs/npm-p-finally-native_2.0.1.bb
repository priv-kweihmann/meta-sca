SUMMARY = "NPM: p-finally"
DESCRIPTION = "`Promise#finally()` ponyfill - Invoked when the promise is settled regardless of outcome"
HOMEPAGE = "https://github.com/sindresorhus/p-finally#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/p-finally/-/p-finally-2.0.1.tgz"
SRC_URI[md5sum] = "1757cb81625fd0af7745711fdcb8eea1"
SRC_URI[sha256sum] = "b47f02524d59c3298c96c973a77bbc5147851c9618265047b95d82f0c631789f"

NPM_PKGNAME = "p-finally"

inherit npmhelper
inherit native
