DEBFILE = "shellcheck_${PV}_armhf.deb"
SRC_URI = "http://ftp.debian.org/debian/pool/main/s/shellcheck/${DEBFILE}"
SRC_URI[md5sum] = "e4df53c015de9894f32b5e6ae58cb850"
SRC_URI[sha256sum] = "fcb397763f8afd0b6aed139610d5646b3e58d432838e306dcabb6b94c62e74ce"

UPSTREAM_CHECK_REGEX = "shellcheck_(?P<pver>[\d\+\-_a-z\.]+)_armhf.deb"
