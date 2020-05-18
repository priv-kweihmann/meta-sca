SUMMARY = "NPM: untildify"
DESCRIPTION = "Convert a tilde path to an absolute path: `~/dev` → `/Users/sindresorhus/dev`"
HOMEPAGE = "https://github.com/sindresorhus/untildify#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/untildify/-/untildify-4.0.0.tgz"
SRC_URI[md5sum] = "717b3d07ed81c6b5f92521026d40d3c3"
SRC_URI[sha256sum] = "a97dc4e6710fffbb8eba030fea59845d7272117d654cb842d5ba7a2e82af93e8"

NPM_PKGNAME = "untildify"

inherit npmhelper
inherit native
