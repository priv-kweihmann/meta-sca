SUMMARY = "NPM: sliced"
DESCRIPTION = "A faster Node.js alternative to Array.prototype.slice.call(arguments)"
HOMEPAGE = "https://github.com/aheckmann/sliced"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d5a2b7edf2e2d0c1e626e1ba4c8f5d85"

SRC_URI = "https://registry.npmjs.org/sliced/-/sliced-1.0.1.tgz"
SRC_URI[md5sum] = "18eec84d5ce829f2a7975c4adfebf5be"
SRC_URI[sha256sum] = "bd9c844b457b68b14d92ed6b1369faf8633b8fc56743523034e5ff250fa15545"

NPM_PKGNAME = "sliced"

inherit npmhelper
inherit native
