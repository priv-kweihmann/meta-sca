SUMMARY = "NPM: json-parse-even-better-errors"
DESCRIPTION = "JSON.parse with context information on error"
HOMEPAGE = "https://github.com/npm/json-parse-even-better-errors#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=93b0b79093749884191709780636db1c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/json-parse-even-better-errors/-/json-parse-even-better-errors-2.3.0.tgz"
SRC_URI[md5sum] = "8175332dc03504647bde5d35f5b64076"
SRC_URI[sha256sum] = "3671e71be0f3d7c445e5e01807e521a0e2b63634a4d8ca45cb5d81846b7bb99b"

NPM_PKGNAME = "json-parse-even-better-errors"

inherit npmhelper
inherit native
