SUMMARY = "RubyGem: aws-sdk-elasticsearchservice"
DESCRIPTION = "Official AWS Ruby gem for Amazon Elasticsearch Service"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "bcf364fa84b3407e7acdc2cd55ce725a"
SRC_URI[sha256sum] = "1ba200d6986689fb445cc7eb60a200c6d5fa8f1262fa158d5ca24bf47abe8842"

GEM_NAME = "aws-sdk-elasticsearchservice"

inherit rubygems
