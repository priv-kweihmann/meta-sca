DEBFILE = "shellcheck_${PV}_i386.deb"
SRC_URI = "http://ftp.debian.org/debian/pool/main/s/shellcheck/${DEBFILE}"
SRC_URI[md5sum] = "ed3081bb6dbebbec556209af895ad614"
SRC_URI[sha256sum] = "0032a8be92f9aa8df31e80865ca84ff82b20ad9dcc19b9d9abc69f7d35286f65"

UPSTREAM_CHECK_REGEX = "shellcheck_(?P<pver>[\d\+\-_a-z\.]+)_i386.deb"
