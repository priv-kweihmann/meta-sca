SUMMARY = "NPM: untildify"
DESCRIPTION = "Convert a tilde path to an absolute path: ~/dev => /Users/sindresorhus/dev"
HOMEPAGE = "https://github.com/sindresorhus/untildify"

DEPENDS = "npm-os-homedir-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=a12ebca0510a773644101a99a867d210"

SRC_URI = "https://registry.npmjs.org/untildify/-/untildify-2.1.0.tgz"
SRC_URI[md5sum] = "f0212bb15032200f429e1abb5d52b858"
SRC_URI[sha256sum] = "83fe4b698ea251d880feb796dd5464bbbde53bf8e268f0d8721e8b163370da9e"

NPM_PKGNAME = "untildify"

inherit npmhelper
inherit native
