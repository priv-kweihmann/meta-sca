LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/LICENSE;md5=e926c89aceef6c1a4247d5df08f94533"

SRC_URI = "https://raw.githubusercontent.com/rickogden/insecure-php-example/master/web/index.php;subdir=source;name=rickogden \
           https://gist.githubusercontent.com/jonathan-fulton/9adbebebcaaaabf9098b9705e044725b/raw/a0c49d884bdec9093a290d9b69cd5a7073c83a41/badsignupform.php;subdir=source;name=jonathanfulton"

SRC_URI[rickogden.md5sum] = "3fdbb702f827b8d4116bce62956b3b37"
SRC_URI[rickogden.sha256sum] = "bd47f2ea8c4d96aedad02260ad92dcd52a14392d494b5b4875a45e2be9ecf9ed"
SRC_URI[jonathanfulton.md5sum] = "e4a0ff1e1960b93abeeea1706230d682"
SRC_URI[jonathanfulton.sha256sum] = "1a4146c478584ecda6102468d7494822023de147af4e0c6ca0b239e48ab74f54"

S = "${WORKDIR}/source"
B = "${WORKDIR}/source"

inherit sca