SUMMARY = "NPM: loud-rejection"
DESCRIPTION = "Make unhandled promise rejections fail loudly instead of the default silent fail"
HOMEPAGE = "https://github.com/sindresorhus/loud-rejection#readme"

DEPENDS = "npm-currently-unhandled-native npm-signal-exit-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=a12ebca0510a773644101a99a867d210"

SRC_URI = "https://registry.npmjs.org/loud-rejection/-/loud-rejection-1.6.0.tgz"
SRC_URI[md5sum] = "f4e5000493b48528f1805d7e633b112b"
SRC_URI[sha256sum] = "ec9e1633627a5cd6f38737ac3f92dda1331248e6ca062e5c8b7d40b1f411c3fa"

NPM_PKGNAME = "loud-rejection"

inherit npmhelper
inherit native
