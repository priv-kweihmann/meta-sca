SUMMARY = "NPM: eslint-plugin-promise"
DESCRIPTION = "Enforce best practices for JavaScript promises"
HOMEPAGE = "https://github.com/xjamundx/eslint-plugin-promise#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://README.md;beginline=112;endline=114;md5=7cbc3c8583189acd79633132761876fb"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-promise/-/eslint-plugin-promise-4.2.1.tgz"
SRC_URI[md5sum] = "0d4851bc1a905b64b383bb577e466c4e"
SRC_URI[sha256sum] = "dc90b05edfd6bb95e1b12b4e18ea61ac747694ee2cfce5d1c765d41e3427b207"

NPM_PKGNAME = "eslint-plugin-promise"

inherit npmhelper
inherit native
