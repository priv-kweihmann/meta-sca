SRC_URI_append = " https://proxy.golang.org/github.com/hashicorp/serf/@v/v0.9.5.zip;srcoutput=github.com/hashicorp/serf;srcinput=github.com/hashicorp/serf@v0.9.5;downloadfilename=github-com-hashicorp-serf-0.9.5.zip;name=github-com-hashicorp-serf"
SRC_URI[github-com-hashicorp-serf.sha256sum] = "b26c9916768043e9480615b4032f9f7d18ee2cdad6a7f75436570610df30fadf"

MOD_LICENSE_append = " \
    MPL-2.0 \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/hashicorp/serf/LICENSE;md5=b278a92d2c1509760384428817710378 \
    file://src/github.com/hashicorp/serf/website/LICENSE.md;md5=149208713ffdc3c5e3cb125f5c24d396 \
    file://src/github.com/hashicorp/serf/website/source/LICENSE;md5=98bf9062d6acf4993de70b52c1e59a70 \
"
