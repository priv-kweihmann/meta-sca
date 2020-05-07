DEBFILE = "shellcheck_${PV}_i386.deb"
SRC_URI = "http://ftp.debian.org/debian/pool/main/s/shellcheck/${DEBFILE}"
SRC_URI[md5sum] = "772ab51a5624f022b657f821d2a21780"
SRC_URI[sha256sum] = "9d530cae792565af2745c6e09e62c050f9996d66550c2bec8eef5c60c67752a6"

UPSTREAM_CHECK_REGEX = "shellcheck_(?P<pver>[\d\+\-_a-z\.]+)_i386.deb"
