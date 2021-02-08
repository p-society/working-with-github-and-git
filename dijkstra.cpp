#include <bits/stdc++.h>
#define int long long
#define f(i, a, n) for (int i = a; i < n; i++)
#define f1(i,a,n) for(int i=a;i>=n;i--)
#define ff first
#define ss second
#define pb push_back
#define mp make_pair
#define all(x) x.begin(), x.end()
#define sortall(x) sort(all(x))
#define fastio ios_base::sync_with_stdio(false), cin.tie(NULL);
#define w1 solve();
#define mod (int)(1e9 + 7)
#define prq priority_queue
#define gcd __gcd
#define sz(x) (int)x.size()
#define w(t) int t; cin>>t; while (t--) { solve(); }
#define N 100005

using namespace std;

typedef vector<int> vi;
typedef pair<int, int> pii;
typedef vector<pii> vpi;

const int INF = (int)(1e17);
const double PI = 3.141592653589793;

int dx[4] = {-1, 0, 1, 0};
int dy[4] = {0, 1, 0, -1};
string path = "URDL";


vpi arr[1000001];
int dis[1000001];

void dijkstra(int src){
	for(int&e:dis) e=INF;
	prq<pii , vpi , greater<pii>> pq;
	pq.push({0,src});
	dis[src]=0;
	while(!pq.empty())
	{
		int u = pq.top().ss;
		int dis_u = pq.top().ff;
		pq.pop();
		if(dis[u]!=dis_u) continue;
		for(auto e:arr[u])
		{
			int v=e.ff;
			int vd=e.ss;
			if(dis[v]>dis[u]+vd)
			{
				dis[v]=dis[u]+vd;
				pq.push({dis[v],v});
			}
		}
	}

}

 void solve()
{
}


int32_t main()
{

	fastio
	// #ifdef ONLINE_JUDGE
	// freopen("input.txt","r",stdin);
	// freopen("output.txt","w",stdout);
	// #endif
		w(t)
	return 0;
}