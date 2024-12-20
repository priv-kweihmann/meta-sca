# a fixup class to allow also none compliant packages to be found

def pypi_pkg_old(d):
    import re
    return re.sub(r"[-_]+", "_", d.getVar('PYPI_PACKAGE')).lower()

PYPI_PACKAGE_OLD ?= "${@pypi_pkg_old(d)}"

def pypi_src_uri_old(d):
    import re
    package = d.getVar('PYPI_PACKAGE_OLD')
    archive_name = d.expand('${PYPI_PACKAGE_OLD}-${PV}.${PYPI_PACKAGE_EXT}')
    archive_downloadname = d.getVar('PYPI_ARCHIVE_NAME_PREFIX') + archive_name
    return 'https://files.pythonhosted.org/packages/source/%s/%s/%s;downloadfilename=%s' % (package[0], package, archive_name, archive_downloadname)


PYPI_SRC_URI = "${@pypi_src_uri_old(d)}"
S = "${WORKDIR}/${PYPI_PACKAGE_OLD}-${PV}"

def pypi_normalize_alt(d):
    import re
    pkg = d.getVar('PYPI_PACKAGE')
    res = [d.getVar('UPSTREAM_CHECK_PYPI_PACKAGE')]
    for item in [(r"[-_.]+", "-"), (r"[-_]+", "-"), (r"[-_.]+", "_"), (r"[-_]+", "_")]:
        res.append(re.sub(item[0], item[1], pkg).lower())
    return res

UPSTREAM_CHECK_REGEX = "(${@'|'.join(pypi_normalize_alt(d))})-(?P<pver>(\d+[\.\-_]*)+).(tar\.gz|tgz|zip|tar\.bz2)"
