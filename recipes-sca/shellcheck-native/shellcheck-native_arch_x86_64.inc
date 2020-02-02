DEBFILE = "shellcheck_${PV}_amd64.deb"
SRC_URI = "http://ftp.debian.org/debian/pool/main/s/shellcheck/${DEBFILE}"
SRC_URI[md5sum] = "2da6bdd212708f9f0a5811eadcd956ea"
SRC_URI[sha256sum] = "c7a182b74a4dd219aec8a28e638e6958906f7a54a77f48afdc288e1c396e548a"

UPSTREAM_CHECK_REGEX = "shellcheck_(?P<pver>[\d\+\-_a-z\.]+)_amd64.deb"
