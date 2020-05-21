SUMMARY = "NPM: assign-symbols"
DESCRIPTION = "Assign the enumerable es6 Symbol properties from one or more objects to the first object passed on the arguments. Can be used as a supplement to other extend, assign or merge methods as a polyfill for the Symbols part of the es6 Object.assign method."
HOMEPAGE = "https://github.com/jonschlinkert/assign-symbols"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b561e0a423bedc9d9ca9c8c67d40abb9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/assign-symbols/-/assign-symbols-2.0.2.tgz"
SRC_URI[md5sum] = "05f4a58d28721b194ac210e79475d235"
SRC_URI[sha256sum] = "8ab5916eb689517911ba7249cec9f257282f84d65b5a1f26bbd445cb94a7f245"

NPM_PKGNAME = "assign-symbols"

inherit npmhelper
inherit native
