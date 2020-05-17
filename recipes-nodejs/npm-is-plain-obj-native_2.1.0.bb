SUMMARY = "NPM: is-plain-obj"
DESCRIPTION = "Check if a value is a plain object"
HOMEPAGE = "https://github.com/sindresorhus/is-plain-obj#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

SRC_URI = "https://registry.npmjs.org/is-plain-obj/-/is-plain-obj-2.1.0.tgz"
SRC_URI[md5sum] = "23b716d73535a85a95b57d53d7ac5df6"
SRC_URI[sha256sum] = "6b6423e1b1aa7427594b9d5a69d430ab309d47ed71a31cfc0306f2b47e070fb5"

NPM_PKGNAME = "is-plain-obj"

inherit npmhelper
inherit native
